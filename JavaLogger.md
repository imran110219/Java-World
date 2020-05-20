# জাভা লগিং                

**লগিং কি?**               
লগিং হল এমন একটি প্রক্রিয়া যখন কোন প্রোগ্রাম এক্সিকিউট হয় তখন নির্দিষ্ট একটা লগ ফাইলে লগ ম্যাসেজ গুলো লেখা হয়। লগিং এর ভেতরে report, error, warning এবং message লেখা হয় যে গুলো পরবর্তীতে অ্যানালাইসিস করে অ্যাপ্লিকেশনের অবস্থা সম্পর্কে বোঝা যায়। যে অবজেক্ট অ্যাপ্লিকেশন লগিং অপারেশন করে থাকে সেটাকে লগার বলা হয়ে থাকে।              

**কেন দরকার লগিং**                                  
জাভা অ্যাপ্লিকেশনে কোন ম্যাসেজ যদি ডেভোলপারের দেখার প্রয়োজন হয় তখন সাধারণভাবে System.out.println() দিয়ে console এ দেখতে পারে। কিন্তু এটা তো কোথাও সেভ হয়ে থাকে না। পরবর্তীতে কোন আলোচনা অথবা অ্যানালাইসিসের এই রিপোর্ট দরকার হয়।                    

**লগিং কম্পোনেন্ট**    
Loggers are responsible for capturing events (called LogRecords) and passing them to the appropriate Appender.
Appenders (also called Handlers in some logging frameworks) are responsible for recording log events to a destination. Appenders use Layouts to format events before sending them to an output.
Layouts (also called Formatters in some logging frameworks) are responsible for converting and formatting the data in a log event. Layouts determine how the data looks when it appears in a log entry.

**লগিং ফ্রেমওয়ার্ক**                 
   

 
 