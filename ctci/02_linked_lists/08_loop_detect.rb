require './linked_list'

def loop_detect(llist)
  slow = llist.first
  fast = llist.first
  while true
    slow = slow.next
    fast = fast.next.next
    break if slow == fast
  end

  slow = llist.first
  while slow != fast
    slow = slow.next
    fast = fast.next
  end

  "Loop starts at link #{slow.key}"
end

l1 = LinkedList.new
l1.insert(1, "a")
l1.insert(2, "b")
l1.insert(3, "c")
l1.insert(4, "d")
l1.insert(5, "e")
l1.last.next = l1.first.next.next # loop link 5 back to link 3
puts loop_detect(l1) #=> "Loop starts at link 3"
