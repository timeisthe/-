#include <stdlib.h>

int* sortedSquares(int* nums, int numsSize, int* returnSize) {
    // 分配结果数组
    int* result = (int*)malloc(numsSize * sizeof(int));
    if (!result) return NULL; // 检查内存分配

    *returnSize = numsSize; // 设置返回的数组大小

    int left = 0, right = numsSize - 1; // 双指针
    int pos = numsSize - 1; // 从末尾开始填充结果数组

    // 双指针法排序
    while (left <= right) {
        int leftSquare = nums[left] * nums[left];
        int rightSquare = nums[right] * nums[right];
        if (leftSquare > rightSquare) {
            result[pos--] = leftSquare;
            left++;
        } else {
            result[pos--] = rightSquare;
            right--;
        }
    }

    return result;
}
