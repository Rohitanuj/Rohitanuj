package main

import (
	"fmt"
	//	"strings"
)

func main() {
	menu := map[string]float64{
		"Curry": 5.99,
		"Rice":  4.99,
		"Pizza": 6.99,
		"salad": 9.99,
	}
	fmt.Println(menu)
	fmt.Println(menu["Curry"])

	for i, v := range menu {
		fmt.Println(i, "--", v)
	}
	phonebook := map[int]string{
		9580229633: "Rohit",
		6393721526: "Ghar",
		8604718385: "Papa",
		7275215453: "Chota Bhaiya",
		8960161981: "Didi",
		7905990939: "Bhaiya",
		8960413079: "Jija",
	}

	fmt.Println(phonebook)
	fmt.Println(phonebook[8960413079])
	phonebook[8960413079] = "Pritu Jija"

	fmt.Println(phonebook)
	fmt.Println(phonebook[8960413079])
}
