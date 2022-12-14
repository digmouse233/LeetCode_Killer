# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def buildTree(self, preorder: List[int], inorder: List[int]) -> TreeNode:
        if (preorder and inorder):
            rootIdx = inorder.index(preorder.pop(0))
            root = TreeNode(inorder[rootIdx])

            root.left = self.buildTree(preorder, inorder[0:rootIdx])
            root.right = self.buildTree(preorder, inorder[rootIdx + 1:])

            return root
