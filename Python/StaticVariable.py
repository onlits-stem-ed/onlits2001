class CountObjects:
    count = 0
    def __init__(self):
        CountObjects.count = CountObjects.count + 1

    def get_count(self):
        return CountObjects.count

ob1 = CountObjects()
print("count=",ob1.get_count())
ob2 = CountObjects()
print("count=",ob2.get_count())