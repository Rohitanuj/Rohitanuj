package main

import (
	"fmt"
	"strings"
)

func morning(n string) {
	fmt.Printf("GoodMorning %v\n", n)
}
func byebye(n string) {
	fmt.Printf("ByEByE  %v\n", n)
}

func main() {
//	variable
	age := 22
	name := "Rohit"
	fmt.Println("Hello, ninjas! my name is", age, "My name is", name)
	fmt.Printf("hello, my age is %v my name is %v\n", age, name)
	fmt.Printf("You scored %0.1f Points", 225.55)
	var str = fmt.Sprintf("hello, my age is %v my name is %v\n", age, name)
	fmt.Printf("The saved string is %v", str)
//	array & slices
	var anu [3]int= [3]int {20,25,24}
	var anuj = [3]int{20, 25, 24}

	fmt.Println(anuj)

	var rohit = []int{30, 400, 500, 433}
	fmt.Println(rohit, len(rohit))
	rohit[2] = 600
	fmt.Println(rohit, len(rohit))
	rohit = append(rohit, 700)
	fmt.Println(rohit, len(rohit))

	//ranges
	rangeOne := rohit[1:4]
	fmt.Println(rangeOne, len(rangeOne))
	anuj := "hello rohit new"
	fmt.Println(strings.Contains(anuj, "hello"))

//	loop
	for i := 0; i < 5; i++ {
		fmt.Println("The value of i is :", i)
	}
	morning("Rohit")
	byebye("Rohit")

}
