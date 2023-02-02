```mermaid
flowchart LR
 SOLR[Solr]:::orangeBox
 subgraph API Clients
  WBR[Web\nBrowser]
  CURL[Curl]
 end

 WBR & CURL <--> SOLR
 
 classDef orangeBox  fill:#ffa500,stroke:#000,stroke-width:3px
```