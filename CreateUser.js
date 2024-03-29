const express = require("express");
const router = express.Router();
const User = require("../modles/User");
const { body, validationResult } = require("express-validator");
router.post(
  "/createuser",
  body("email").isEmail(),
  body("name").isLength({ min: 5 }),
  body("password").isLength({ min: 5 }),
  async (req, res) => {
    const error = validationResult(req);
    if (!error.isEmpty()) {
      return res.status(500).json({ error: error.array() });
    }
    try {
      await User.create({
        name: req.body.name,
        password: req.body.password,
        email: req.body.email,
        location: req.body.location,
      }),
        res.json({ success: true });
    } catch (error) {
      console.log(error);
      res.json({ success: false });
    }
  }
);

router.post(
  "/loginuser",
  [body("email").isEmail(), body("password").isLength({ min: 5 })],
  async (req, res) => {
    const errors = validationResult(req);
    if (!errors.isEmpty()) {
      return res.status(500).json({ errors: errors.array() });
    }
    let email = req.body.email;
    try {
      let userData = await User.findOne({ email });
      if (true) {
        if (!userData) {
          return res
            .status(400)
            .json({ errors: "Try Logging With Correct Credentials" });
        }
        if (req.body.password !== userData.password) {
          return res
            .status(400)
            .json({ errors: "Try Logging With Correct Credentials3234" });
        }
        return res.json({ success: true });
      }
    } catch (error) {
      console.log(error);
      res.json({ success: false });
    }
  }
);

module.exports = router;
