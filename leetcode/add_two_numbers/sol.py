class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

def addTwoNumbers(l1, l2):
    """
    :type l1: ListNode
    :type l2: ListNode
    :rtype: ListNode
    """
    tmp1 = l1
    num1 = l1.val
    ex = 1
    while (tmp1.next):
        tmp1 = tmp1.next
        num1 += (10 ** ex) * tmp1.val
        ex += 1

    tmp2 = l2
    num2 = l2.val
    ex = 1
    while (tmp2.next):
        tmp2 = tmp2.next
        num2 += (10 ** ex) * tmp2.val
        ex += 1

    res_num = num1 + num2
    res_list = ListNode(res_num % 10)
    runner = res_list
    res_num /= 10
    while (res_num > 0):
        tmp = ListNode(res_num % 10)
        runner.next = tmp
        runner = tmp
        if (res_num == 0):
            break
        res_num /= 10

    return res_list

# Test
l1 = ListNode(2)
l1.next = ListNode(4)
l1.next.next = ListNode(3)

l2 = ListNode(5)
l2.next = ListNode(6)
l2.next.next = ListNode(4)

addTwoNumbers(l1, l2)
