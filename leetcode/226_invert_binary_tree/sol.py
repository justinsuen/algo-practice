# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def invertTree(self, root):
        """
        :type root: TreeNode
        :rtype: TreeNode
        """

        # 1. Recursion
        # if root == None:
        #     return None
        #
        # root.right, root.left = self.invertTree(root.left), self.invertTree(root.right)
        #
        # return root

        # 2. DFS Stack
        stack = [root]
        while stack:
            curr = stack.pop()
            if curr:
                curr.left, curr.right = curr.right, curr.left
                stack.append(curr.right)
                stack.append(curr.left)
        return root
