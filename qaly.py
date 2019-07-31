#qaly = quality of life * length of period (years)

num_input = int(input())
qaly_output = 0
for i in range(num_input):
	qaly_input = input().split()
	quality,years = [float(x) for x in qaly_input]
	qaly_output += quality * years
	
print("%.3f" % qaly_output)