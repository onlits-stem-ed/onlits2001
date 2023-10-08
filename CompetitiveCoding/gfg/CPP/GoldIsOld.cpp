/*
You are playing a game where you have an initial number of
    experience points. There are a total of n quests available to
    complete.

    • Each quest requires a minimum amount of experience points to
    start.

    • Upon completing a quest, you gain a certain amount of experience
    points.

    Consider a case where you have x experience points, you can
    complete any quest that requires <=x experience points to start
    and hence gain more experience points as a result of completing that
    quest.

    However, you only have enough time to complete most k quests.
    Your goal is to determine the maximum number of experience points
    you can accumulate.

    Example 1:

    Input:
    n=5

    intial_exp 10

    exp_req= [3,2,4,1,2]

    exp gain [5,3,6,2,4]

    k = 3

    Output:

    25

*/

#include <iostream>

using namespace std;

bool Consumed(int *games, int n, int k);
int MaximumExp(int *exp_req, int *exp_gain, int n, int init_exp, int k);

int main(void)
{
    int exp_req[] = {3, 2, 4, 1, 2};
    int exp_gain[] = {5, 3, 6, 2, 4};
    cout << "Test Case 1:" << endl;
    cout << "Maximum of " << MaximumExp(exp_req, exp_gain, 5, 10, 3) << " can be earned." << endl;
    return 0;
}

int MaximumExp(int *exp_req, int *exp_gain, int n, int init_exp, int k)
{
    int max_exp = 0;
    int next;
    int games[k];
    int games_size = 0;
    int max = 0;
    for (int j = 0; j < k; j++)
    {
        for (int i = 0; i < n; i++)
        {
            if (Consumed(games, games_size, i) != false)
            {
                if (exp_gain[i] > max)
                {
                    max = exp_gain[i];
                    games[games_size] = i;
                }
            }
        }

        max_exp += max;
    }

    return max_exp;
}

bool Consumed(int *games, int n, int k)
{
    for (int i = 0; i < n; i++)
    {
        if (games[i] == k)
            return true;
    }

    return false;
}