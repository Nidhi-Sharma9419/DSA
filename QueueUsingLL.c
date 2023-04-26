#include<stdio.h>
#include<conio.h>
#include<malloc.h>
struct node{
    int data;
    struct node *next;
};
struct queue
{
    struct node *front;
    struct node *rear;
};
struct queue *q;
void create_queue(struct queue *);
struct queue *insert(struct queue*, int);
