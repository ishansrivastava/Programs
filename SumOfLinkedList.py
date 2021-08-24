# This is an input class. Do not edit.
class LinkedList:
    def __init__(self, value):
        self.value = value
        self.next = None


def sumOfLinkedLists(linkedListOne, linkedListTwo):
    # Write your code here.
	first=linkedListOne
	second=linkedListTwo
	newLinkedListHead=LinkedList(0)
    three=newLinkedListHead
	carry=0
	
	while first is not None or second is not None or carry!=0:
		firstValue=first.value if first is not None else 0
		secondValue=second.value if second is not None else 0
		sumValue=firstValue+secondValue+carry
		carry=sumValue//10
		newNode=LinkedList(sumValue%10)
		three.next=newNode
		three=newNode
		print(three.value)
		first=first.next if first is not None else None
		second=second.next if second is not None else None
		
	return newLinkedListHead.next
