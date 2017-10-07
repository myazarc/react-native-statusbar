

import React, { Component } from 'react';
import { NativeModules } from 'react-native';

export default class MYCStatusbar extends Component {
  static setColor(color) {
    NativeModules.MYCStatusbar.setColor(color);
  }

  render() {
    return this.props.children || null;
  }
}