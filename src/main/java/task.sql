SELECT q.*, u.username , count(a.*) FROM questions q
INNER JOIN users u on u.id = q.user_id
LEFT JOIN answers a on q.id = a.question_id
group by q.id, u.username;