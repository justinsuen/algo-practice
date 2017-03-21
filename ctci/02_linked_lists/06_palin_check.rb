require './linked_list'

# This function should return if the LL forms a palindrome
# O(n) time and O(n) space
def palin_check(llist)
  # find length
  p1 = llist.first
  p2 = llist.first
  stack = []
  length = 0
  while p2.next
    stack.push(p1.val)
    p1 = p1.next
    if p2.next.next
      p2 = p2.next.next
      length += 2
    elsif p2.next
      p2 = p2.next
      length += 1
    end
  end

  # p1 is at midpoint and now we pop while stack is not empty
  stack.pop if length % 2 == 1
  while p1
    return false if stack.pop != p1.val
    p1 = p1.next
  end
  true
end

l1 = LinkedList.new
l1.insert(1, "a")
l1.insert(2, "b")
l1.insert(3, "b")
l1.insert(4, "a")
puts palin_check(l1) #=> true

l2 = LinkedList.new
l2.insert(1, "a")
l2.insert(2, "b")
l2.insert(3, "c")
l2.insert(4, "b")
l2.insert(5, "a")
puts palin_check(l2) #=> true

l3 = LinkedList.new
l3.insert(1, "a")
l3.insert(2, "d")
l3.insert(3, "c")
l3.insert(4, "b")
l3.insert(5, "a")
puts palin_check(l3) #=> false
