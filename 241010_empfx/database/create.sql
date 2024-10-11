create table if not exists employees (
    id integer not null primary key autoincrement,
    name text,
    city text,
    salary real
);