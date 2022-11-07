# Write a program that asks the user how many Fibonnaci numbers to generate and then generates them.

def fibonnaci(n):
    if n<=1:
        return n
    else :
        return (fibonnaci(n-1)+fibonnaci(n-2))


number= int(input())
i=1
for i in range(number):
    print(fibonnaci(i))

