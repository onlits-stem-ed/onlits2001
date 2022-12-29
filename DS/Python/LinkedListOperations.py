class Node:
    def __init__(self, data):
        self.__data = data
        self.__next = None

    def get_data(self):
        return self.__data

    def get_next(self):
        return self.__next

    def set_next(self, next):
        self.__next = next



class List:
    def __init__(self):
        self.__head = None        #instance variable
        self.__cn = None

    def menu(self):
        while(True):
            print("MAIN MENU")
            print("1. Display (Traversal)")
            print("2. Insert (At the end)")
            ch = int(input("Enter your choice (0 to exit): "))
            if(ch==0):
                break
            elif(ch==1):
                self.display()
            elif(ch==2):
                self.insert_end()
            else:
                print("\nInvalid option!\n")

    def display(self):
        if(self.__head == None):
            print("\nList is empty. There is nothing to display!\n")
        else:
            print("\nThe list contains following elements:")
            self.__cn = self.__head
            while(True):
                print(self.__cn.get_data())
                self.__cn = self.__cn.get_next()        #Increment __cn
                if(self.__cn.get_next() == None):
                    print(self.__cn.get_data())
                    break

    def insert_end(self):
        i = input("Enter in integer: ")
        if(self.__head==None):      #Code for creating first node
            self.__head = Node(i)
            self.__cn = self.__head   
        else:                      #Code for creating other nodes
            self.__cn.set_next(Node(i))



l = List()
l.menu()