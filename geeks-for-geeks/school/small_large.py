#smaller and larger: http://www.practice.geeksforgeeks.org/problem-page.php?pid=572

##linear search
t = int(raw_input())

for i in range(0,t):
    line = map(int, raw_input().split())
    val = map(int, raw_input().split())
    n = line[0]
    x = line[1]
    
    small = 0
    large = 0
    for j in range(0,n):
        if val[j]==x:
            large += 1
            small += 1
        elif val[j]<x:
            small += 1
        else:
            large += 1
    print str(small) + ' ' + str(large)

##binary search

#helper
def helper(val, low, high, x):
    if val[low] > x:
        return 0, len(val)
    elif val[high] < x:
        return len(val), 0
        
    mid = (low+high)/2
    
    if val[mid] == x: #check number of same elements
        leftInd = mid
        rightInd = mid
        #go left and see if still equal
        for j in range(0, mid+1):
            if val[mid-j] == x:
                leftInd -= 1
            else:
                break
        #go right and see if still equal
        for i in range(mid, len(val)):
            if val[i] == x:
                rightInd += 1
            else:
                break
        return rightInd, len(val)-leftInd-1
    elif val[mid] < x:
        if mid+1 <= high and x <= val[mid+1]:
            return mid+1,  len(val)-mid-1
        else:
            return helper(val, mid+1, high, x)
    else:
        if mid-1 >= low and x > val[mid-1]:
            return mid, len(val)-mid+1
        else:
            return helper(val, low, mid-1, x)


#main
t = int(raw_input())

for i in range(0,t):
    line = map(int, raw_input().split())
    val = map(int, raw_input().split())
    n = line[0]
    x = line[1]
    
    low = 0
    high = n-1
    low, high = helper(val, low, high, x)
    
    print low, high