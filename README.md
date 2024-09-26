## CoinCraft

**Problem Statement**-
In today's fast-paced financial landscape, customers face challenges in managing their finances effectively. Many 
struggles with understanding their spending habits, optimizing savings, and making informed investment decisions. 
Traditional banking interfaces often lack personalized insights and actionable advice, leaving customers feeling 
disconnected and overwhelmed. 
Objective: 
Develop an innovative solution leveraging open-source technologies to enhance customer engagement and 
provide personalized financial insights. The solution should address the following key areas: 
1. Personalized Financial Insights: Create a chatbot or virtual assistant that analyses customer transaction data to offer tailored 
advice on budgeting, saving, and investing. 
2. Spending and Saving Goals: Build a tool that helps customers set, track, and achieve their financial goals using AI-generated 
recommendations based on their spending patterns. 
3. Investment Guidance: Develop a platform that provides users with AI-driven insights into investment opportunities, risk 
assessments, and portfolio optimization tailored to individual financial profiles. 
4. Educational Resources: Integrate an educational module that offers personalized financial literacy content based on user 
behaviour and queries, helping customers make informed financial decisions. 
5. User-Centric Interface: Design an intuitive interface that simplifies complex financial data and provides users with easy 
access to their insights and recommendations.
**Overview**
CoinCraft is an innovative personal finance application designed to help users track spending habits, set financial goals, and receive personalized financial advice. Utilizing advanced AI technologies, CoinCraft simplifies complex financial information, making it accessible and engaging for everyone.


![Architecture Diagram](https://github.com/manasdp/Coincraft/blob/main/Additional/AdaCitiBank%20(2).jpg)

## Problem 1: Data Analysis and Querying Using LangChain & OpenAI

- **User Interaction:** The user interacts with the system through a dashboard interface, providing input data and querying the system.

- **Database Schema & Relevant Files:** The system connects to a database where various types of user data are stored, such as:
  - User Information (basic profile information)
  - Account Information (bank account details, balances, transactions)
  - Loan Account Information (loan details, EMIs)
  - Investment Information (stocks, mutual funds, bonds)
  - Insurance Information (insurance policies, coverage)
  - Income Tax Statements (tax-related records)

- **Retrieving Information:** The system uses LangChain, an advanced AI framework that integrates Large Language Models (LLMs) (such as OpenAI's GPT) to query and retrieve relevant information from the database.

- **Query Relevant Information:** LangChain processes the user’s query to extract relevant data from the database by analyzing structured or unstructured data.

- **Access Control:** There is a Role-Based Access Control (RBAC) system in place that ensures only authorized users can view or access specific data. This is crucial for maintaining data security.

## Problem 2: Background Check for Stocks/Mutual Funds Using AI

- **External Data Integration:** This involves fetching real-time data from external sources such as News APIs.
- **Fetching News Articles:** Automated systems pull financial news from different sources.
- **Validation:** This process ensures that the fetched articles are accurate, complete, and free from errors before further analysis.
- **LangChain:** Once the external data is fetched, LangChain processes it and provides an intelligent layer to analyze the information using predefined AI models.
- **Financial Ratio Analysis:** The system can compute and analyze various financial ratios (e.g., P/E ratio, debt-to-equity ratio) to assess the financial health of a company or mutual fund.
- **Company Reputation:** It checks and verifies the reputation of companies, considering both historical data and recent market trends from the news.
- **Market Sentiment Analysis:** This involves using Natural Language Processing (NLP) models to determine the market sentiment (positive, negative, neutral) based on the news articles.
- **Risk Analysis:** Based on the data and AI outputs, it determines whether the stock/mutual fund is low-risk or high-risk for investment.

## Problem 3: Document-Based Querying Using an AI Model

- **Input Document:** A document, such as "RBI Kahahta Hai!" (Official or public policy document), is provided as input to the system.
- **Splitting the Text:** The document is split into smaller, manageable text chunks. This is essential for processing long documents efficiently.
- **Encoder Model:** The text chunks are passed through an encoder model, which is an AI model used to convert text into numerical formats called embeddings. These embeddings are stored in a database for further retrieval.
- **User Questions:** Users can ask questions related to the document. These questions are processed and converted into embeddings using the same encoder model.
- **Similarity Search:** The system compares the embedding of the question to the embeddings of the document's text chunks using similarity search. This identifies the most relevant parts of the document that could answer the user's question.
- **LLM (Large Language Model):** The relevant document chunks are passed to an LLM (like GPT), which generates a detailed and coherent answer for the user's question based on the retrieved information.

- ## Video Demonstration
Watch our video  on YouTube: [CoinCraft Overview](https://www.youtube.com/watch?v=jZxVpGvL6Dw)

**Key Features**
* Real-Time Financial Recommendations: Users can input queries, and our system provides tailored financial insights based on unique spending patterns.
* Risk Profiling & Portfolio Optimization: Analyze user portfolios and provide personalized investment recommendations using sentiment analysis.
* Personalized Financial Literacy: Engage users with dynamic content, quizzes, and gamification elements to enhance learning about finances.

**Unique Value Proposition**
* Ease of Use: Simplifies spending tracking and goal setting with intuitive graphs and charts.
* Personalization: Delivers tailored financial insights and investment advice based on user behavior and market sentiment.
* Engaging Learning: Makes financial education fun and interactive while prioritizing data security.

**Technology Stack**
* Frontend: Mobile application available on Play Store and iOS.
* Backend: Azure Functions for real-time data processing and OpenAI's GPT-3.5 Turbo for natural language processing.
* Data Storage: Azure Blob Storage and SQL/NoSQL databases for diverse spending pattern tracking.
* APIs: Integration with News API for market updates and sentiment analysis.

**Key Performance Indicators (KPIs)**
* Conversion Rate for Goal Setting: Percentage of users successfully achieving savings or investment goals.
* Investment Portfolio Performance: ROI compared to benchmark indices.
* User Growth Rate: Rate of new user sign-ups.
* Churn Rate: Percentage of users discontinuing service.

Scalability and Ease of Deployment
Scalability:

**Adaptive Architecture**
Our solution is built on a microservices architecture that allows individual components to scale independently. This design ensures that as user demand increases, specific services can be enhanced without requiring a complete overhaul of the system.
Elastic Resource Management: We leverage cloud-based infrastructure to provide elastic resource management. This enables automatic scaling of resources based on real-time demand, ensuring optimal performance during peak times while minimizing costs during off-peak periods.
Support for High User Volume: The system is designed to handle a high volume of concurrent users seamlessly. This capability is crucial for banking applications, where user activity can fluctuate significantly.
Future-Proofing: As the financial landscape evolves, our scalable solution can accommodate new features and functionalities. This adaptability ensures that we can integrate emerging technologies and respond to changing user needs without extensive redesigns.
Ease of Deployment:

**Simplified Deployment Process**
Our deployment process is streamlined and efficient, enabling quick setup in various environments, including development, testing, and production. This simplicity reduces the time from development to launch.
Continuous Integration and Continuous Deployment (CI/CD): We implement CI/CD practices to automate testing and deployment. This approach not only speeds up the release cycle but also ensures that updates are consistently delivered without disruption to users.
Containerization: By utilizing containerization technologies like Docker, we ensure that our application can be deployed consistently across different environments. This technology eliminates environment-specific issues and enhances reliability.
Comprehensive Documentation: We provide thorough documentation and user guides for deployment, making it easy for teams to set up and configure the application according to their specific requirements.
Minimal Downtime: Our deployment strategy focuses on minimizing downtime during updates or changes, ensuring that users can continue to access services without interruption.


### References for Problem 1
- Medium article on financial sentiment analysis with LangChain and OpenAI: [Financial Sentiment Analysis with LangChain and OpenAI](https://medium.com/@fl.brienza/financial-sentiment-analysis-with-langchain-and-openai-4a0c3c1cd0e4)
- Webinar on John Snow Labs' integrations with LangChain and HayStack for enhanced retrieval augmented generation: [John Snow Labs Webinar](https://www.johnsnowlabs.com/webinars/)  
  Note: The exact link for the webinar might change, so you may need to navigate through John Snow Labs' website to find the most recent relevant webinar.

## Problem 2: Background Check for Stocks/Mutual Funds Using AI

- **External Data Integration:** This involves fetching real-time data from external sources such as News APIs.
- **Fetching News Articles:** Automated systems pull financial news from different sources.
- **Validation:** This process ensures that the fetched articles are accurate, complete, and free from errors before further analysis.
- **LangChain:** Once the external data is fetched, LangChain processes it and provides an intelligent layer to analyze the information using predefined AI models.
- **Financial Ratio Analysis:** The system can compute and analyze various financial ratios (e.g., P/E ratio, debt-to-equity ratio) to assess the financial health of a company or mutual fund.
- **Company Reputation:** It checks and verifies the reputation of companies, considering both historical data and recent market trends from the news.
- **Market Sentiment Analysis:** This involves using Natural Language Processing (NLP) models to determine the market sentiment (positive, negative, neutral) based on the news articles.
- **Risk Analysis:** Based on the data and AI outputs, it determines whether the stock/mutual fund is low-risk or high-risk for investment.

### References for Problem 2
- Fast Data Science blog on LLM and NLP applications: [Building an AI Financial Analyst Using LangChain, OpenAI Function Calling, and Streamlit](https://fsndzomga.medium.com/building-an-ai-financial-analyst-using-langchain-openai-function-calling-and-streamlit-part-1-1c910cf57f92)

## Problem 3: Document-Based Querying Using an AI Model

- **Input Document:** A document, such as "RBI Kahahta Hai!" (Official or public policy document), is provided as input to the system.
- **Splitting the Text:** The document is split into smaller, manageable text chunks. This is essential for processing long documents efficiently.
- **Encoder Model:** The text chunks are passed through an encoder model, which is an AI model used to convert text into numerical formats called embeddings. These embeddings are stored in a database for further retrieval.
- **User Questions:** Users can ask questions related to the document. These questions are processed and converted into embeddings using the same encoder model.
- **Similarity Search:** The system compares the embedding of the question to the embeddings of the document's text chunks using similarity search. This identifies the most relevant parts of the document that could answer the user's question.
- **LLM (Large Language Model):** The relevant document chunks are passed to an LLM (like GPT), which generates a detailed and coherent answer for the user's question based on the retrieved information.

### References for Problem 3
- Webinar on John Snow Labs' integrations with LangChain and HayStack for enhanced RAG pipelines: [John Snow Labs Webinar](https://www.johnsnowlabs.com/webinars/)

