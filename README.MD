# B-reactive : A programming language to model reactive behaviors in multi-agent systems

Multi-agent systems (MAS) are based on the idea of an autonomous computer entity (an agent) that can act on a environnment. In general, the agent can act on an environment, change it, perceive others behavirours and react to it.

With a pletora of MAS tools and framework avaiable, non-programmers users may find quite difficult to find the appropriate MAS tool the their needs. Moreover, every tool has its own particularity, turning difficult, if not impossible, to reproduce the same MAS model simulation in different MAS plaftorms.

By using Model driven develppment approach, B-reactive language provides an top  layer level of abstraction that encapusulates MAS specificities and allows the user to model MAS reactive behavior through the use domain-specific language. Moreover, it provides code generators to two MAS plaftforms : Cormas and NEtlogo.

B-reactive is thus, a set of languages and tools that provide :

 * An abstract syntax language (based on and represented by ecore model)
 * A contrece syntax language based on EBNF and transformed in a textual editor
 * A code generator to 
 * File contents are saved in the URL so you can share files

You will need 
Look, a list!

 * foo
 * bar
 * baz

And here's some code! :+1:

```javascript
$(function(){
  $('div').html('I am a div.');
});
```

This is [on GitHub](https://github.com/jbt/markdown-editor) so let me know if I've b0rked it somewhere.


Props to Mr. Doob and his [code editor](http://mrdoob.com/projects/code-editor/), from which
the inspiration to this, and some handy implementation hints, came.

### Stuff used to make this:

 * [markdown-it](https://github.com/markdown-it/markdown-it) for Markdown parsing
 * [CodeMirror](http://codemirror.net/) for the awesome syntax-highlighted editor
 * [highlight.js](http://softwaremaniacs.org/soft/highlight/en/) for syntax highlighting in output code blocks
 * [js-deflate](https://github.com/dankogai/js-deflate) for gzipping of data to make it fit in URLs
