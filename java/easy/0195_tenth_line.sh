# Problem: Tenth Line
# Problem No: 195
# Platform: LeetCode
# Difficulty: Easy
# Topics: Shell, File Handling
# Language: Bash

# ----------------------------------
# Problem Statement:
# ----------------------------------
# Given a text file file.txt, print just the 10th line of the file.
# If the file contains fewer than 10 lines, output nothing.

# ----------------------------------
# Approach / Explanation:
# ----------------------------------
# 1. Use 'sed' command to directly print the 10th line.
# 2. '10p' tells sed to print the 10th line.
# 3. If the file has less than 10 lines, sed prints nothing automatically.

# ----------------------------------
# Tech Used:
# ----------------------------------
# - Bash
# - sed command

# ----------------------------------
# Solution:
# ----------------------------------

sed -n '10p' file.txt
