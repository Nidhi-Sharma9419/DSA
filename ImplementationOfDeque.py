from os import *
from sys import *
from collections import *
from math import *

class Deque:
    def __init__(self, size):
        # Write your code here
        self.size=size
        self.queue=[0]*size
        self.front=-1
        self.rear=-1

    # Pushes 'X' in the front of the deque. Returns true if it gets pushed into the deque, and false otherwise.
    def pushFront(self, x):
        # Write your code here
        if self.isFull():
            return False
        if self.front==-1:
            self.front=0
            self.rear=0
        else:
            self.front=(self.front-1)%self.size
        self.queue[self.front]=x
        return True

    # Pushes 'X' in the back of the deque. Returns true if it gets pushed into the deque, and false otherwise.
    def pushRear(self, x):
        # Write your code here
        if self.isFull():
            return False
        if self.front==-1:
            self.front=0
        self.rear=(self.rear+1)%self.size
        self.queue[self.rear]=x
        return True


    # Pops an element from the front of the deque. Returns -1 if the deque is empty, otherwise returns the popped element.
    def popFront(self):
        # Write your code here
        if self.isEmpty():
            return -1
        x=self.queue[self.front]
        if self.front==self.rear:
            self.front=self.rear=-1
        else:
            self.front=(self.front+1)%self.size
        return x

    # Pops an element from the back of the deque. Returns -1 if the deque is empty, otherwise returns the popped element.
    def popRear(self):
        # Write your code here
        if self.isEmpty():
            return -1
        x=self.queue[self.rear]
        if self.front==self.rear:
            self.front=self.rear=-1
        else:
            self.rear=(self.rear-1)%self.size
        return x
        
    # Returns the first element of the deque. If the deque is empty, it returns -1.
    def getFront(self):
        # Write your code here
        if self.isEmpty():
            return -1
        return self.queue[self.front]

    # Returns the last element of the deque. If the deque is empty, it returns -1.
    def getRear(self):
        # Write your code here
        if self.isEmpty():
            return -1
        return self.queue[self.rear]
        

    # Returns true if the deque is empty. Otherwise returns false.
    def isEmpty(self):
        # Write your code here
        if self.front==-1:
            return True
        return False

    # Returns true if the deque is full. Otherwise returns false.
    def isFull(self):
        # Write your code here
        if (self.rear+1)%self.size==self.front:
            return True
        return False
