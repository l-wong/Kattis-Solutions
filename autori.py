user_input = input()

output = ""

for i in user_input:
	if i.isupper():
		output += i
print(output)


#alternate solution
#print(''.join([s[0] for s in input().split('-')]))
