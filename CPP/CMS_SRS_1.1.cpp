#include<iostream>
#include "SRS.cpp"

using namespace std;

int main()
{
	SRS srs("Clinic Management System",1.1);
	srs.getPurpose("This SRS describes the analysis done...");
	srs.getConvention("This document does not use any specific convention.");
	srs.getReferences("Journal on Clinics Management");
	srs.show();
	return 0;
}
