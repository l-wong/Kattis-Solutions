cups = input()

cupPos = [True,False,False]
for c in cups:
	if c == 'A':
		temp = cupPos[0]
		cupPos[0] = cupPos[1]
		cupPos[1] = temp
	if c == 'B':
		temp = cupPos[1]
		cupPos[1] = cupPos[2]
		cupPos[2] = temp
	if c == 'C':
		temp = cupPos[0]
		cupPos[0] = cupPos[2]
		cupPos[2] = temp
print(cupPos.index(True) + 1)




