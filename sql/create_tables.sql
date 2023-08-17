CREATE TABLE payment (
  "id" SERIAL PRIMARY KEY,
  "user_id" bigint NOT NULL,
  "type" varchar(25) NOT NULL,
  "amount" bigint NOT NULL,
  "status" varchar(50),
  "created_at" timestamp,
  "updated_at" timestamp
);
