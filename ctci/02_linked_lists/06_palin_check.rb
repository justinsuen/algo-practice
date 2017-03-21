require './linked_list'

# This function should return if the LL forms a palindrome
def palin_check(llist)
  # find length
  p1 = llist.first
  p2 = llist.first
  length = 0
  while p2.next
    p1 = p1.next
    p2 = p2.next.next
  end
end

l1 = LinkedList.new
l1.insert(1, "a")
l1.insert(2, "b")
l1.insert(3, "b")
l1.insert(4, "a")

puts palin_check(l1) #=> true
