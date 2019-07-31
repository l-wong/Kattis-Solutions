
x,y = [str(n) for n in input().split()]
flip_x = reversed(list(x))
int_x = int(''.join(flip_x))

flip_y = reversed(list(y))
int_y = int(''.join(flip_y))

if int_x > int_y:
    print(int_x)
else:
    print(int_y)