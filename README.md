# two sum algo

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Samples :

```
  case 1:
        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Output: Because nums[0] + nums[1] == 9, we return [0, 1].
  case 2:
        Input: nums = [3,2,4], target = 6
        Output: [1,2]
  case 3:
        Input: nums = [3,3], target = 6
        Output: [0,1]

```

Constraints:
```
        2 <= nums.length <= 104
        -109 <= nums[i] <= 109
        -109 <= target <= 109
        Only one valid answer exists.
```

## What do you need
- Java 11

## Launch tests (unit test)
```bash
$ mvn clean test
```
