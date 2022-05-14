package main

import (
	"fmt"
)

/**
  两数之和
*/

func main() {
	nums := []int{2, 7, 11, 1}
	target := 9
	indexs := twoSum(nums, target)
	fmt.Printf("%v", indexs)

}

func twoSum(nums []int, target int) []int {

	numMap := make(map[int]int)
	for i, i2 := range nums {

		if value, ok := numMap[target-i2]; ok {
			return []int{value, i}
		}
		numMap[i2] = i
	}
	return []int{0, 0}
}
