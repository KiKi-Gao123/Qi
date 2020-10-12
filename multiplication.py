j = 1
while j <= 9:
    i = 1
    while i <= j:
        print(f'{i}*{j}={i*j}',end='\t') #j和i的联动
        i += 1
    print() #换行
    j += 1 #j自增1