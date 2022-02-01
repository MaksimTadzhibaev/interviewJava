-- ошибки в расписании 
select
film1.name as "фильм-1",
ses.seance_start,
film1.duration as "фильм-1 время начала",
film2.name as "фильм-2",
ses2.seance_start,
film2.duration as "фильм-2 время начала"
 from cinema.schedule ses
left join cinema.films film1 on film1.id = ses.id
inner join cinema.schedule ses2 on ses2.seance_start between ses.seance_start and date_add(ses.seance_start, INTERVAL film1.duration MINUTE) and ses.id<>ses2.id
left join cinema.films film2 on ses2.id = film2.id
order by ses.seance_start;


-- перерывы 30 минут и более между фильмами
select C.name as "фильм_1",
       C.time_start as "время_начала",
       C.duration as "длительность",
       C1.time_start as "время_начала_второго_фильма",
       timediff (C1.time_start, C.film_end) as "длительность_перерыва"
FROM filmschedule AS C
         LEFT JOIN filmschedule AS C1
                   ON C.time_start <> C1.time_start
WHERE C1.id IS NOT NULL
  and C1.time_start > C.film_end
  and timediff (C1.time_start, C.film_end) >= '00.30.00'
order by длительность_перерыва desc; 