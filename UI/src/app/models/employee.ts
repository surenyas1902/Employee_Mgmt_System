import { Grade } from "./grade";

export interface Employee {
    id: String;
    firstName: String;
    lastName: String;
    gender: String;
    dob: Date;
    resume: String;
    doj: Date;
    supervisor: String;
    grade: Grade;
}
