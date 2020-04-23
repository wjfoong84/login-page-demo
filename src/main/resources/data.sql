USE [login_page_demo]

INSERT INTO [dbo].[roles] ([name]) VALUES ('User');
INSERT INTO [dbo].[roles] ([name]) VALUES ('Manager');

INSERT INTO [dbo].[users] ([password] , [username]) 
	VALUES ('$2a$10$EblZqNptyYvcLm/VwDCVAuBjzZOI7khzdyGPBr08PpIi0na624b8.' , 'johndoe');
INSERT INTO [dbo].[users] ([password] , [username]) 
	VALUES ('$2a$10$EblZqNptyYvcLm/VwDCVAuBjzZOI7khzdyGPBr08PpIi0na624b8.' , 'maryjane');

INSERT INTO [dbo].[users_user_roles] ([users_id] , [user_roles_id]) VALUES 
(
	(SELECT [id] FROM [dbo].[users] WHERE [username] = 'johndoe'), 
	(SELECT [id] FROM [dbo].[roles] WHERE [name] = 'User')
);
INSERT INTO [dbo].[users_user_roles] ([users_id] , [user_roles_id]) VALUES 
(
	(SELECT [id] FROM [dbo].[users] WHERE [username] = 'maryjane'), 
	(SELECT [id] FROM [dbo].[roles] WHERE [name] = 'Manager')
);
