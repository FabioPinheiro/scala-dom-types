package com.raquo.dombuilder.jsdom.simple.builders

import com.raquo.dombuilder.generic
import org.scalajs.dom

trait SimpleTagBuilder extends generic.builders.TagBuilder[SimpleTag, dom.Element]
{
  override def build[Ref <: dom.Element](tagName: String, void: Boolean): SimpleTag[Ref] = {
    new SimpleTag[Ref](tagName, void)
  }
}
