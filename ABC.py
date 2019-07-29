#A < B < C

num_input = sorted([int(i) for i in input().split()])
letter_input = input()
final_output = []


for l in letter_input:
    if l == 'C':
        final_output.append(str(num_input[2]))
    elif l == 'A':
        final_output.append(str(num_input[0]))
    elif l == 'B':
        final_output.append(str(num_input[1]))

print(' '.join(final_output))
