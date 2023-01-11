#include <stdio.h>
#define MAX 10

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
void filter_grade(const HOTEL *master, const int in_size, HOTEL *result, int *out_size);
void sort_room_charge(HOTEL *hotel, const int size);

int main(void)
{
    HOTEL master[MAX], result[MAX];
    int size = 0, out_size = 0;
    //------------------------ Initialization ------------------------------------
    init(master, &size);
    printf("--------------------------- MASTER DATA ------------------------------\n");
    sort_room_charge(master, size);
    display(master, size);

    //--------------------------- Testing Objective 1 -----------------------------
    printf("--------------------------- OBJECTIVE 1 ------------------------------\n");
    filter_grade(master, size, result, &out_size);
    sort_room_charge(result, out_size);
    display(result, out_size);
    return 0;
}

int init(HOTEL master[], int *size) // To make testing easy
{
    FILE *fp;
    fp = fopen("Hotel.dat", "r");
    while (!feof(fp))
    {
        fscanf(fp, "%[^,],%[^,],%c,%f,%d\n", master[*size].name, master[*size].address, &master[*size].grade, &master[*size].avg_room_charge, &master[*size].no_of_rooms);
        (*size)++;
    }
}

void display(const HOTEL hotel[], const int size)
{
    printf("%-50s%-50s%-20s%20s%20s\n", "Name", "Address", "Grade", "Average Room Charge", "Number of Rooms");
    for (int i = 0; i < size; i++)
    {
        printf("%-50s%-50s%-10c%20.2f%20d\n", hotel[i].name, hotel[i].address, hotel[i].grade, hotel[i].avg_room_charge, hotel[i].no_of_rooms);
    }
}

void filter_grade(const HOTEL *master, const int in_size, HOTEL *result, int *out_size)
{
    char grade;
    *out_size = 0;
    printf("Enter grade: ");
    scanf("%c", &grade);
    for (int i = 0; i < MAX; i++)
    {
        if (master[i].grade == grade)
        {
            result[*out_size] = master[i];
            (*out_size)++;
        }
    }
}

void sort_room_charge(HOTEL *hotel, const int size)
{
    for(int i=0; i<size-1; i++)
    {
        for(int j=i+1; j<size; j++)
        {
            if(hotel[i].avg_room_charge > hotel[j].avg_room_charge)
            {
                HOTEL t = hotel[i];
                hotel[i] = hotel[j];
                hotel[j] = t;
            }
        }
    }
}