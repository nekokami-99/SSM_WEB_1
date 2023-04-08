# SSM_-实验一
MySQL建库sql在指导书PDF中
*项目结构*
F:.
│  mybatis-demo.iml
│  pom.xml
│  project.txt
│  实验一指导书.pdf
│  
├─.idea
│  │  .gitignore
│  │  compiler.xml
│  │  dataSources.local.xml
│  │  dataSources.xml
│  │  jarRepositories.xml
│  │  misc.xml
│  │  modules.xml
│  │  sqldialects.xml
│  │  workspace.xml
│  │  
│  ├─dataSources
│  │  │  8515fd8e-2d4d-412c-93fa-4a0fdd3159bb.xml
│  │  │  c6e793e4-6e82-4efe-92aa-f166679bc897.xml
│  │  │  
│  │  ├─8515fd8e-2d4d-412c-93fa-4a0fdd3159bb
│  │  │  └─storage_v2
│  │  │      └─_src_
│  │  │          └─schema
│  │  │                  information_schema.FNRwLQ.meta
│  │  │                  mysql.osA4Bg.meta
│  │  │                  performance_schema.kIw0nw.meta
│  │  │                  
│  │  └─c6e793e4-6e82-4efe-92aa-f166679bc897
│  │      └─storage_v2
│  │          └─_src_
│  │              └─schema
│  │                      information_schema.FNRwLQ.meta
│  │                      mysql.osA4Bg.meta
│  │                      performance_schema.kIw0nw.meta
│  │                      
│  ├─libraries
│  │      Maven__ch_qos_logback_logback_classic_1_2_3.xml
│  │      Maven__ch_qos_logback_logback_core_1_2_3.xml
│  │      Maven__junit_junit_4_13.xml
│  │      Maven__mysql_mysql_connector_java_5_1_46.xml
│  │      Maven__org_hamcrest_hamcrest_core_1_3.xml
│  │      Maven__org_mybatis_mybatis_3_5_5.xml
│  │      Maven__org_slf4j_slf4j_api_1_7_20.xml
│  │      
│  └─mybatisx
│          templates.xml
│          
├─src
│  ├─main
│  │  ├─java
│  │  │  └─com
│  │  │      └─itheima
│  │  │          ├─mapper
│  │  │          │      AcMapper.java
│  │  │          │      
│  │  │          └─pojo
│  │  │                  Ac.java
│  │  │                  
│  │  └─resources
│  │      │  logback.xml
│  │      │  mybatis-config.xml
│  │      │  
│  │      └─com
│  │          └─itheima
│  │              └─mapper
│  │                      AcMapper.xml
│  │                      
│  └─test
│      └─java
│              ACtest.java
│              
└─target
    ├─classes
    │  │  logback.xml
    │  │  mybatis-config.xml
    │  │  
    │  └─com
    │      └─itheima
    │          ├─mapper
    │          │      AcMapper.class
    │          │      AcMapper.xml
    │          │      
    │          └─pojo
    │                  Ac.class
    │                  
    ├─generated-sources
    │  └─annotations
    ├─generated-test-sources
    │  └─test-annotations
    └─test-classes
            ACtest.class
