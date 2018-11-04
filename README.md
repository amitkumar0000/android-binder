# android-binder

Android libc does not suppot System V IPC 

Binder to the rescue!

Its built-in reference-counting of "object" references plus death-notification mechanism make it
suitable for "hostile" environments (where lowmemorykiller roams)

When a binder service is no longer referenced by any clients, its owner is automatically notified
that it can dispose of it 


Many other features:

"Thread migration" - like programming model:

Automatic management of thread-pools

Methods on remote objects can be invoked as if they were local - the thread appears to
"jump" to the other process

Synchronous and asynchronous (oneway) invocation model

Identifying senders to receivers (via UID/PID) - important for security reasons

Unique object-mapping across process boundaries

A reference to a remote object can be passed to yet another process and can be used as an
identifying token

Ability to send file descriptors across process boundaries

Simple Android Interface Definition Language (AIDL)

Built-in support for marshalling many common data-types

Simplified transaction invocation model via auto-generated proxies and stubs (Java-only)
Recursion across processes - i.e. behaves the same as recursion semantics when calling methods
on local objects

Local execution mode (no IPC/data marshalling) if the client and the service happen to be in the
same process

Most app component life-cycle call-backs (e.g. onResume(), onDestory(), etc.)
are invoked by ActivityManagerService via binder

IPC via

1. Intent and contentProvider
2. Messenger IPC
3. AIDL (Android interface definition language)