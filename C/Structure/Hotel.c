#include <stdio.h>
#define MAX 5

typedef struct
{
    char name[50];
    char address[50];
    char grade;
    float avg_room_charge;
    int no_of_rooms;
} HOTEL;

int init(HOTEL master[], int *size);
void display(const HOTEL hotel[], const int size);

int main(void)
{
    HOTEL master[MAX];
    int size = 0;
    init(master, &size);
    display(master, size);
    return 0;
}

int init(HOTEL master[], int *size) //To make testing easy
{
    FILE *fp;
    fp = fopen("Hotel.dat", "r");
    fscanf(fp, "%s,%s,%c,%f,%d\n", master[0].name, master[0].address, master[0].grade, master[0].avg_room_charge, master[0].no_of_rooms);
    (*size)++;
}

void display(const HOTEL hotel[], const int size)
{
    printf("%s%s%s%s%s\n", "Name", "Address", "Grade", "Average Room Charge", "Number of Rooms");
    for(int i=0; i<size; i++)
    {
        printf("%s%s%c%f%d\n",hotel[i].name, hotel[i].address, hotel[i].grade, hotel[i].avg_room_charge,hotel[i].no_of_rooms);
    }
}