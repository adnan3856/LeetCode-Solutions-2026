Solution:
++++++++++
The problem requires finding the middle node of a singly linked list. A straightforward approach would be to traverse the list once to count the nodes and then traverse again to the middle. However, this takes extra space and an additional traversal.
A more efficient approach is using two pointers (slow and fast). The idea is:
• Slow pointer ( slow) moves one step at a time.
• Fast pointer (fast) moves two steps at a time.
• By the time fast reaches the end of the list, slow will be at the middle.
This works because fast moves twice as fast as slow, so when fast reaches the end, slow will have traveled half the distance.

Question:
++++++++++

Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.

 

Example 1:


Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.
Example 2:


Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
 

Constraints:

The number of nodes in the list is in the range [1, 100].
1 <= Node.val <= 100
