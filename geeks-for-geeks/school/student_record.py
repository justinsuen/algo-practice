#student record: http://www.practice.geeksforgeeks.org/problem-page.php?pid=603

t = int(raw_input())

for i in range(0,t):
    highest_scorer = "Null"
    highscore = 0
    
    n = int(raw_input())
    input = raw_input().split(' ')
    for j in range(0,n*4,4):
        avg = sum(map(int, input[j+1:j+4]))/3
        if avg > highscore:
            highest_scorer = input[j]
            highscore = avg
    print str(highest_scorer) + ' ' + str(highscore)