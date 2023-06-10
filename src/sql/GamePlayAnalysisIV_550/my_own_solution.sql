-- https://leetcode.com/problems/game-play-analysis-iv

select
    round(count(distinct logged_in_again.player_id) / count(distinct a3.player_id), 2) fraction
from
    activity a3
        left join (
        select a1.player_id
        from activity a1 join activity a2 on a1.player_id = a2.player_id and a1.event_date >= a2.event_date + interval '1' day and a1.event_date < a2.event_date + interval '2' day where (a2.player_id, a2.event_date) in (select player_id, min(event_date) from activity group by player_id)
        ) logged_in_again on a3.player_id = logged_in_again.player_id;