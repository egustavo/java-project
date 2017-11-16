CREATE TABLE public.salesperson
(
  salesperson_id SERIAL PRIMARY KEY NOT NULL,
  first_name VARCHAR(20) NOT NULL,
  last_name VARCHAR(20) NOT NULL,
  email VARCHAR(60) NOT NULL,
  phone_number VARCHAR(20) NOT NULL
);

CREATE TABLE public.contact
(
  contact_id SERIAL PRIMARY KEY NOT NULL,
  first_name VARCHAR(20) NOT NULL,
  last_name VARCHAR(20) NOT NULL,
  email VARCHAR(60) NOT NULL,
  phone_number VARCHAR(20) NOT NULL,
  organization VARCHAR(80) NOT NULL
);

CREATE TABLE public.stage
(
  stage_id SERIAL PRIMARY KEY NOT NULL,
  stage_name VARCHAR(40) NOT NULL,
  stage_description VARCHAR(200) NOT NULL
);

CREATE TABLE public.lead
(
  lead_id SERIAL PRIMARY KEY NOT NULL,
  lead_name VARCHAR(80) NOT NULL,
  lead_description VARCHAR(200) NOT NULL,
  product_quantity INT NOT NULL,
  lead_total NUMERIC(10,2),
  contact_id INT NOT NULL,
  salesperson_id INT NOT NULL,
  stage_id INT NOT NULL,
  CONSTRAINT lead_contact_contact_id_fk FOREIGN KEY (contact_id) REFERENCES contact (contact_id),
  CONSTRAINT lead_salesperson_salesperson_id_fk FOREIGN KEY (salesperson_id) REFERENCES salesperson (salesperson_id),
  CONSTRAINT lead_stage_stage_id_fk FOREIGN KEY (stage_id) REFERENCES stage (stage_id)
);

CREATE TABLE public.note
(
  note_id SERIAL PRIMARY KEY NOT NULL,
  note_content VARCHAR(250) NOT NULL,
  date_created TIMESTAMP NOT NULL,
  salesperson_id INT NOT NULL,
  lead_id INT NOT NULL,
  CONSTRAINT note_salesperson_salesperson_id_fk FOREIGN KEY (salesperson_id) REFERENCES salesperson (salesperson_id),
  CONSTRAINT note_lead_lead_id_fk FOREIGN KEY (lead_id) REFERENCES lead (lead_id)
);