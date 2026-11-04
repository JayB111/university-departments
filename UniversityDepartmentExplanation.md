University Department Class Diagram

1. University and Department — Composition

A University has one or more Departments, and each Department belongs to exactly one University.

This is a composition relationship because Departments depend on the University. If the University closes, its Departments cease to exist.

2. Department and Lecturer — Association

A Department can have multiple Lecturers, and a Lecturer can teach in multiple Departments.

This is an association relationship because Lecturers exist independently of Departments. If a Department is dissolved, its Lecturers can be reassigned to other Departments and do not disappear.

Conclusion

The University–Department relationship is composition, while the Department–Lecturer relationship is a many-to-many association.