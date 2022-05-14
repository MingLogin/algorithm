package main

import "fmt"

/**
双指针反转字符串
 */

func main() {
	str :=[]string{"h","e","l","l","o"}
	reverseString(str)
}
func reverseString(s []string)  {
	start := 0
	end := len(s)-1
	for start<end{
		s[start],s[end]= s[end],s[start]
		start++
		end--
	}
	fmt.Println(s)
}

