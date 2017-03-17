def maxDepth(self, root):
    # One-liner recursion
    return 1 + max(self.maxDepth(root.left), self.maxDepth(root.right)) if root else 0
