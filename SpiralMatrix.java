/*
Spiral Matrix Problem
Problem Statement

Given a matrix of size M × N, print all its elements in spiral order, starting from the top-left corner and moving clockwise.

The traversal should follow this sequence repeatedly:

Left → Right (Top Row)
Top → Bottom (Right Column)
Right → Left (Bottom Row)
Bottom → Top (Left Column)

After completing one outer layer, continue the same process for the remaining inner matrix until every element has been printed exactly once.

Example
Input
4 4

1   2   3   4
5   6   7   8
9  10  11  12
13 14  15  16
Output
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
*/

import java.util.ArrayList;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] mat={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int left=0;
        int right=mat[0].length-1;
        int top=0;
        int bottom=mat.length-1;
        ArrayList<Integer> result=new ArrayList<>();
while (left <= right && top <= bottom) {

    // Top row
    for (int i = left; i <= right; i++)
        result.add(mat[top][i]);
    top++;

    // Right column
    for (int i = top; i <= bottom; i++)
        result.add(mat[i][right]);
    right--;

    // Bottom row
    if (top <= bottom) {
        for (int i = right; i >= left; i--)
            result.add(mat[bottom][i]);
        bottom--;
    }

    // Left column
    if (left <= right) {
        for (int i = bottom; i >= top; i--)
            result.add(mat[i][left]);
        left++;
    }
}
        System.out.println(result);
    }
}
