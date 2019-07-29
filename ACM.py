
rightQ=[]
contest_scores = {}
total_time = 0

while True:
    userInput = input().split()
    if len(userInput)!= 1:
        time,q,ans = [str(x) for x in userInput]
        
        if ans == 'right' and q not in contest_scores and q not in rightQ:
            contest_scores[q] = [int(time)]
            rightQ.append(q)
            
        elif ans == 'right' and q in contest_scores and q not in rightQ:
            contest_scores[q].append(int(time))
            rightQ.append(q)

        elif ans == 'wrong' and q not in contest_scores:
            contest_scores[q] = [20]
            
        elif ans == 'wrong' and q in contest_scores:
            contest_scores[q].append(20)

    else:
        break
    
for r in rightQ:
    total_time += sum(contest_scores.get(r))

print(len(rightQ), total_time)
    
'''
for r in rightQ:
    win_times = contest_scores.get(r)
    for w in win_times:
        total_time += w
'''
    



