require './linked_list'

def sum_lists(list1, list2)
  sum = 0
  ex = 0

  l1 = list1.first
  l2 = list2.first

  while l1.next || l2.next
    l1_val = l1.val ? l1.val : 0
    l2_val = l2.val ? l2.val : 0

    tmp_sum = (10**ex) * (l1_val + l2_val)
    sum += tmp_sum
    ex += 1

    l1 = l1.next ? l1.next : nil
    l2 = l2.next ? l2.next : nil
  end

  sum
end

l1 = LinkedList.new
l1.insert(1, 7)
l1.insert(2, 1)
l1.insert(3, 6)

l2 = LinkedList.new
l2.insert(1, 5)
l2.insert(2, 9)
l2.insert(3, 2)

puts sum_lists(l1, l2)
