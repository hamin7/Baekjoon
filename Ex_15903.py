a=input()
a=a.split()
a[0]=int(a[0])
a[1]=int(a[1])
b=input()
b=b.split()
for i in range(a[0]):
    b[i]=int(b[i])
for i in range(a[1]):
    b=sorted(b)
    temp=b[0]+b[1]
    b[0]=temp
    b[1]=temp
temp=0
for i in range(a[0]):
    temp+=b[i]
print(temp)
