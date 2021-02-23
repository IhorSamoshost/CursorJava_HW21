create table public.books
(
    id bigserial
       constraint books_pk
       primary key,
    title  varchar,
    in_use boolean
);

INSERT INTO public.books (title, in_use) VALUES ('Anna Karenina', false);
INSERT INTO public.books (title, in_use) VALUES ('Robinson Crusoe', false);
INSERT INTO public.books (title, in_use) VALUES ('Brave New World', false);